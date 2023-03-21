package HW;

import HW.UI.UIConsole;
import HW.service.Srevice;

import java.security.Provider;

public class Program {
    public static void main(String[] args) {
        Srevice service = new Srevice();
        service.start();
    }
}
