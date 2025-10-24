package btlocators;

public class LocatorsCRM {
    //Xpath nav bar menu
    public static String menuDashboard = "//span[normalize-space()='Dashboard' and @class='menu-text']";
    public static String menuLeads = "//span[normalize-space()='Leads' and @class='menu-text']";
    public static String menuTasks = "//span[normalize-space()='Tasks' and @class='menu-text']";

    //Xpath tương đối cách 1 - 5 trang Leads
    //Xpath trang Leads (các button, input search, header, label)
    public static String headerLeadsSummary = "//span[contains(normalize-space(),'Leads Summary')]";
    public static String inputSearchLeads = "//div[@id='leads_filter']//input[@type='search']";
    public static String btnNewLead= "//a[contains(@href,'#') and normalize-space()='New Lead']";
    public static String btnLeadsSummery ="//a[contains(@href,'#') and contains(@data-title,'Leads Summary')]";
    public static String btnLeadSwitchKanbanOrList ="//a[contains(@href,'switch_kanban')]";
    //Xpath trang New Leads
    public static String dropdownStatus = "//button[contains(@data-id,'status')]";
//    public static String inputSearchStatus = "//button[contains(@data-id,'status')]/following-sibling::div//input[@type='search']";
    public static String dropdownSource = "//button[contains(@data-id,'source')]";
    public static String inputSearchSource = "//button[contains(@data-id,'source')]/following-sibling::div//input[@type='search']";
    public static String dropdownAssigned= "//button[contains(@data-id,'assigned')]";
//    public static String inputSearchAssigned= "//button[contains(@data-id,'assigned')]/following-sibling::div//input[@type='search']";
    public static String leadDropdownTags= "//div[@id='inputTagsWrapper']//ul/li/input[@type='text']";
    public static String leadSelectedTags= "//div[@id='inputTagsWrapper']//ul/li[@class='ui-menu-item' and normalize-space()='Selenium']";
    public static String inputName = "//input[@id='name']";
    public static String inputAddress = "//input[@id='address']";
    public static String inputPosition = "//input[@id='title']";
    public static String inputCity = "//input[@id='city']";
    public static String inputEmailAddress = "//input[@id='email']";
    public static String inputState = "//input[@id='state']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownCountry = "//button[contains(@data-id,'country')]";
//    public static String inputSearchCountry = "//button[contains(@data-id,'country')]/following-sibling::div//input[@type='search']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String inputLeadValue = "//input[@name='lead_value' and @type='number']";
    public static String dropdownDefaultLanguage = "//button[contains(@data-id,'default_language')]";
//    public static String inputSearchDefaultLanguage = "//button[contains(@data-id,'default_language')]/following-sibling::div//input[@type='search']";
    public static String inputCompany = "//input[@id='company']";
    public static String inputDescription = "//textarea[@id='description']";
    public static String leadCheckBoxPublic = "//input[@id='lead_public']";
    public static String leadBabelPublic = "//label[@for='lead_public']";
    public static String checkBoxContactedToday = "//input[@id='contacted_today']";
    public static String labelContactedToday= "//label[@for='contacted_today']";

    public static String btnCloseAddNewLead ="//div[@class='lead-edit']//button[normalize-space()='Close']";
    public static String btnSaveLead ="//button[@id='lead-form-submit' and normalize-space()='Save']";

    //Xpath tương đối cách 6 - 10 rang Tasks
//    public static String headerTasksSummary = "//span[contains(normalize-space(),'Tasks Summary')]";
//    public static String inputSearchTask = "//div[@id='tasks_filter']//input[@type='search']";
//    public static String btnNewTask = "//a[contains(@href,'#') and normalize-space()='New Task']";
//    public static String btnTaskSwitchKanbanOrList = "//a[contains(@href,'switch_kanban')]";
//    public static String btnTaskOverview = "//a[contains(@href,'detailed_overview') and contains(text(),'Tasks Overview')]";
    public static String btnCloseAddNewTask ="//div[@class='modal-footer']//button[@type='submit' and normalize-space()='Save']/preceding-sibling::button[normalize-space()='Close']";
    public static String btnSaveTask ="//div[@class='modal-footer']//button[@type='submit' and normalize-space()='Save']";

    public static String taskCheckBoxPublic = "//label[@for='task_is_public']/preceding::input[@id='task_is_public']";
    public static String taskLabelPublic = "//input[@id='task_is_public']/following::label[@for='task_is_public']";
    public static String checkBoxBillable = "//label[@for='task_is_public']/preceding::input[@id='task_is_public']";
    public static String labelBillable = "//input[@id='task_is_billable']/following::label[@for='task_is_billable']";
    public static String linkTextAttachFiles = "//i[contains(@class,'fa fa-plus')]/preceding::input[@type='file']";

    public static String addMoreAttachFile = "//div[@id='new-task-attachments']/descendant::button[contains(@class,'add_more_attachments')]";
    public static String removeAttachFile = "//div[@id='new-task-attachments']/descendant::button[contains(@class,'remove_attachment')]";

    public static String inputSubject = "//label[@for='name']/following::input[@id='name']";
    public static String inputHourlyRate = "//label[@for='hourly_rate']/following::input[@id='hourly_rate']";
    public static String inputStartDate = "//label[@for='startdate']/following::div/input[@id='startdate']";
    public static String inputDuaDate = "//label[@for='duedate']/following::div/input[@id='duedate']";
    public static String dropdownPriority = "//label[@for='priority']/following::div/button[@data-id='priority']";
    public static String selectedPriority = "//label[@for='priority']/following::div//span[normalize-space()='Low']";
    public static String dropdownRepeatEvery = "//label[@for='repeat_every']/following::div/button[@data-id='repeat_every']";
    public static String selectedRepeatEvery = "//label[@for='repeat_every']/following::div//span[normalize-space()='Week']";
    public static String inputTotalCycles = "//label[@for='cycles']/following::div//input[@id='cycles']";
    public static String checkBoxInfinity = "//div[@id='cycles_wrapper']/child::div//input[@id='unlimited_cycles']";
    public static String labelInfinity = "//div[@id='cycles_wrapper']/child::div//label[@for='unlimited_cycles']";

    public static String dropdownRelatedTo = "//label[@for='rel_type']/following::div/button[@data-id='rel_type']";
    public static String selectedRelatedTo = "//label[@for='rel_type']/following::div//span[normalize-space()='Project']";
    public static String dropdownAssignees = "//label[@for='assignees']/following::div/button[@data-id='assignees']";
    public static String inputSearchAssignees = "//button[@data-id='assignees']/following-sibling::div//input[@type='search']";
    public static String dropdownFollowers = "//label[contains(@for,'followers')]/following::div/button[contains(@data-id,'followers')]";
    public static String inputSearchFollowers = "//button[contains(@data-id,'followers')]/following-sibling::div//input[@type='search']";
    public static String taskDropdownTags= "//div[@id='inputTagsWrapper']/child::ul//input[@placeholder='Tag' and @type='text']";
    public static String taskSelectedTags= "//label[@for='tags']/following::ul//li[normalize-space()='Selenium']";
    public static String clickTaskDescription = "//p[normalize-space()='Task Description']/following::div/textarea[@id='description']";
    public static String inputTaskDescription = "//p[normalize-space()='Task Description']/following::iframe[@id='description_ifr']";

}
