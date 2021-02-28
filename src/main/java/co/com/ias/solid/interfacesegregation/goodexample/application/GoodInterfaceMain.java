package co.com.ias.solid.interfacesegregation.goodexample.application;

import co.com.ias.solid.interfacesegregation.goodexample.domain.AdminUser;
import co.com.ias.solid.interfacesegregation.goodexample.domain.AnonymousUser;
import co.com.ias.solid.interfacesegregation.goodexample.domain.AuditorUser;

public class GoodInterfaceMain {

    public static void main(String[] args) {
        AdminUser admin = new AdminUser();
        admin.createResource("Server2");
        admin.deleteResource("Server");

        AuditorUser auditor = new AuditorUser();
        auditor.getResourceBill("Database");

        AnonymousUser invited = new AnonymousUser();
        invited.getPublicResources();
    }

}
