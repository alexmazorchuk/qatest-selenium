package myTest;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.Xpath.*;

public class TestNumismatCatalog extends Methods {
    public static String txtNullResult = "0 результати";
    public static String txtResult = "";

    @Test(description = "myTestNumismaticPageForm")

    public static void getMunismaticsItems() throws InterruptedException {

        NavigableAndClick(BtnMenuGrn, BtnMenuNumPage2);
//        Navigable(BtnMenuGrn);
//        ClickButton(BtnMenuNumPage);
        WaitLoadPage2S();
        WaitLoadPage2S();
//        txtResult = getTXT(FieldNumismatResult);

//        if (txtResult == txtNullResult) {
//            System.out.println("Numismatic page is empty!");
//        } else {
//            System.out.println("Numismatic OK - " + txtResult);
//        }
    }
}
