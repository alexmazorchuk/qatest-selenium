package myTest;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.Xpath.*;

public class TestMainUsdEur extends Methods {
    public static String valUsd = "0";
    public static String valEur = "0";

    @Test(description = "firstTestUsdMain")

    public static void getCurrencyCurseMainPage() throws InterruptedException {

        valUsd = getTXT(FieldMainCurrUsd);
        valEur = getTXT(FieldMainCurrEur);

        if (valUsd == "0" || valUsd == "-" ) {
            System.out.println("CurrencyCourse for USD on MainPage BAD!");
        } else {
            System.out.println("CurrencyCourse for USD on MainPage OK!");
        }
        if (valEur == "0" || valEur == "-" ) {
            System.out.println("CurrencyCourse for EUR on MainPage BAD!");
        } else {
            System.out.println("CurrencyCourse for EUR on MainPage OK!");
        }

    }
}
