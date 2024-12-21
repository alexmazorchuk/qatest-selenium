package xpath.and.methods;

public class Xpath {

    public static final String BtnMenuGrn ="//a[@href='/ua/uah']";
    public static final String BtnMenuNumPage ="//a[@href='/ua/uah/numismatic-products/souvenier-coins']";
    public static final String BtnMenuNumPage2 ="/html/body/header/div[2]/div/div/div/div[1]/div/nav/ul/li[7]/div/div/div[2]/div[2]/ul/li[1]/ul/li/a";
    public static final String FieldNumismatResult ="(//div[@class='col-md-6']//b)[2]";

    public static final String LinkLang ="/html/body/header/div[2]/div/div/div/div[1]/nav/ul/li[5]/a/span";
    public static final String FieldChart ="/html/body/main/div/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]";
    public static final String FieldDataNotFound ="/html/body/main/div/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/svg/g/g[2]/g[2]/g/g[9]/g[2]/g/g/text/tspan";

    public static final String FieldSvgChart ="//div[@id='interestRates']";
    public static final String BtnInterestRateChart ="//a[@href='/ua/markets/interest-rates']";
    public static final String BtnMenuFinMarket ="//a[@href='/ua/markets']";

    public static final String FieldMainCurrEur ="//*[@id=\"container-3\"]/div/div[2]/div[1]/div[3]/div/div[2]/div/div";
    public static final String FieldMainCurrUsd ="//*[@id=\"container-3\"]/div/div[2]/div[1]/div[4]/div/div[2]/div/div";

    public static final String linkMyRoom ="https://adm.dev.goseechat.com/dashboard";
    public static final String FieldEmail = "//*[@placeholder='Email']";
    public static final String FieldPassword = "//*[@placeholder='Password']";
    public static final String ButtonSignIn = "//button[@id='kt_sign_in_submit']";
    public static final String ButtonApps = "//*[@class='menu-title' and contains(text(),'Apps')] ";
    public static final String ButtonUserManager = "//*[@class='menu-title' and contains(text(),'User Management')]";
    public static final String Employee = "//*[@class='menu-title' and contains(text(),'Employee')]";
    public static final String Employees = "//*[@class='menu-title' and contains(text(),'Employees')]";
    public static final String ButtonAddEmployee = "//button[@id='addEmployeeBtn']";
    public static final String FieldFullName = "//*[@placeholder='Full name']";
    public static final String FieldFullEmail = "//*[@placeholder='Email']";
    public static final String ButtonSaveChanges = "//button[@id='saveChanges']";
    public static final String FieldSearch = "//*[@placeholder='Search employee']";
    public static final String NewEmployeeName = "//td[@class='d-flex align-items-center']";
    public static final String NewEmployeeEmail = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[1]/div/span";
    public static final String  ErromMsgWithEmail = "//div[@data-field='email']";
    public static final String  ErrorMsgWithPassword = " //div[@id='swal2-html-container']";
    public static final String NegativeBackDataFromFieldSearch = "//select[@name='users-table_length']";
//    public static final String NegativeBackDataFromFieldSearch = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/label/select/option[1]";



    //xpath from Taya
public static final String AdminNotificationButton = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div[4]/span/span[2]";
public static final String NotificationsButton = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/a/span[2]";
public static final String OpenNotificationForm = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[2]";
public static final String FieldNameNotification = "//*[@placeholder='Full name']";
public static final String FieldSlugNotification = "//*[@placeholder='Slug']";
public static final String SaveNotificationButton = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[3]/button[2]";
public static final String SearchFieldNotification = "//input[@id = 'mySearchInput']";
public static final String NewNotificationName = "//span[@class='text-gray-800 mb-1']";
public static final String ActionNotificationButton = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[6]/a";
public static final String DeleteNotificationButton = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[6]/div/div[3]/a";
public static final String DeactivateOrActiveNotificationButton = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[6]/div/div[2]/a";
public static final String ArchiveNotificationButton = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[6]/div/div[4]/a";
public static final String EmailCheckboxNotification = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div[3]/div[1]/input";
public static final String EmailSubjectNotification = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div[4]/input";
public static final String BodyEmailNotification = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div[4]/textarea";
public static final String ActionForFirstNotitfication = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[6]/a";
public static final String DeleteFirstNotification= "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[6]/div/div[3]/a";
    //xpath from Alex
public static final String ButtonActions = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[5]/a";
public static final String ButtonDismiss = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[5]/div/div[3]/a";
public static final String TelegramCheckboxNotification = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div[3]/div[2]/input";
public static final String BodyTelegramNotification = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div[5]/input";

}
