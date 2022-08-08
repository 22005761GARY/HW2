# HW2

#Finacial-Report

## Model

    這裡建立一個Employee.class建立員工的
    屬性(@AllArgsConstructor)和方法(@Getter, @Setter)

## Service

    建立一個EmyployeeService.class去設定商業邏輯，其中包含以下:
    1.public List<Employee> getAllEmployees(){...} 
    -> 查詢所有員工(GET)
    2.public Employee getEmployeeById(int id){...} 
    -> 依據員工id查詢員工(GET)
    3.public Employee createEmployee(Employee employee){...} 
    -> 新增員工(POST)
    4.public Employee updateEmployee(int id, Employee employee){...} 
    -> 依據員工id更新該員工的屬性(PUT)
    5.public Employee deleteEmployee(int id){...} 
    -> 刪除員工(DELETE)

## Controller

    建立HRcontroller去回傳系統經由Service後的結果
    GET, POST, PUT, DELETE
