package myTest;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.Xpath.*;

public class TesInterestRateChart extends Methods {

    public static String dataNotFoundUk = "Дані не вдалося завантажити";

    @Test(description = "myFirstTest")

    public static void getChartInteresRate() throws InterruptedException {
//      click on main btn in menu - Financial Market
        ClickButton(BtnMenuFinMarket);

//      click on btn for chart page
        ClickButton(BtnInterestRateChart);

//      need wait for loaded chart
        WaitLoadPage2S();

        if (getTXT(FieldSvgChart) != dataNotFoundUk) {
            System.out.println("Chart loaded!");
        } else {
            System.out.println("Chart not load - " + dataNotFoundUk);
        }

//        AssertTXT(getTXT(FieldSvgChart), txtFormChart); // порівнює отриманий текст з тим, що має бути - змінна TXT

        WaitLoadPage(10000);
    }
}