# Java
任務一：設計一個類別「HourlyEmployee」，繼承Employee，實作Payable界面，用以表示時薪員工，並具備基礎錯誤參數檢查的建構式與服務方法功能：
    1. 需要實作「getPaymentAmount」方法，代表取得應付金額的功能，注意週工時超過40小時需多給加班費50%
    2. 需要實作「wage」、「hours」屬性以及屬性的取得、設定服務方法
    3. 需要實作「HourlyEmployee」方法，代表類別建構式
    4. 請覆寫「toString」方法，提供顯示時薪員工各項明細資料的功能
    5. 各種屬性實體變數於操作屬性寫入時需實作數值合理範圍的檢查功能
任務二：設計一個類別階層，分別為「Commission Employee」、「BasePlusCommissionEmployee」2個類別，繼承Employee，實作Payable界面，用以表示佣金員工及底薪加佣金員工，並具備基礎錯誤參數檢查的建構式與服務方法功能：
    1. 需要分別為「CommissionEmployee」、「BasePlus CommissionEmployee」實作「getPaymentAmount」方法，代表取得應付金額的功能
    2. 需要分別實作「grossSales」、「comissionRate」、「baseSalary」屬性以及屬性的取得、設定服務方法
    3. 需要分別實作「CommissionEmployee」、「BasePlusCommissionEmployee」方法，代表類別建構式
    4. 請分別覆寫「toString」方法，提供顯示薪水的功能
    5. 各種屬性實體變數於操作屬性寫入時需實作數值合理範圍的檢查功能
任務三：設計一個類別「InterfacePayableTest」，具備程式進入點Main()功能，利用Payable界面、多型的處理各種「Employee」、「Invoice」子類別：
    1. 至少需要內含二個Invoice實體物件
    2. 至少需要內含一個HourlyEmployee實體物件
    3. 至少需要內含一個SalariedEmployee實體物件
    4. 至少需要內含一個Commission Employee、一個BasePlusCommission Employee實體物件，並將CommissionEmployee之獎金比率提高50%
    5. 請利用toString、getPaymentAmount方法，進行Payable界面多型呼叫，以輸出所有應付帳款明細項目
