public class Student {
    private String name;
    private  String id;
    private  String group;
    private  String email;

    /*----------------------------------------
    Phương thức get set
    create By Hieu 01/08/2020
    ------------------------------------------*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    /*------------------------------------------------------------
    *   khởi tạo Constructer
    *   Created By Hieu 01/08/2020
    *-----------------------------------------------------------*/
    public void setEmail(String email) {
        this.email = email;
    }

    public  Student(){
        this.name = "Student";
        this.id = "0000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    public Student (Student s){
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public  String getInfo(){
        return name + " - " + id + " - " + group + " - " +email;
    }

}
