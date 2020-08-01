public class StudentManagement {

    public static void main(String[] args) {
        /*Student s1 = new Student();
        Student s2 = new Student();
        s2.setGroup("K61CD");
        s2.setId("16020958");
        Student s3 = new Student();
        Student s4= new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student();

        StudentManagement s = new StudentManagement();
        s.addStudent(s1);
        s.addStudent(s2);
        s.addStudent(s3);
        s.addStudent(s4);
        s.addStudent(s5);
        s.addStudent(s6);
        s.addStudent(s7);
        s4.setGroup("K63CB");
        s5.setGroup("K62CLC");
        s.removeStudent("16020958");
        System.out.println(s.getListStudents());*/
    }

    /*----------------------------------------------------------
     * Khởi tạp các thành phần của Student Management
     * Created By Hieu 01/08/2020
     *
     * ----------------------------------------------------------*/
    public Student[] students = new Student[100] ;
    int length = 0;
    String[] group = new String[10] ;
    int idem = 0;

    /*----------------------------------------------------------
    * Kiem tra 2 sinh vien co cung lop hay khong
    * Created By Hieu 01/08/2020
    *
    * ----------------------------------------------------------*/
    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup()) ;
    }

    /*-------------------------------------------------------------
    * Thêm mới Sinh viên
    * Created By Hieu 01/08/2020
    * --------------------------------------------------------------*/
    public void addStudent (Student newStudent){
        students[length] = newStudent;
        length++;
    }

    /*-------------------------------------------------------------
     * Hiểm thị danh sách sinh viên
     * Created By Hieu 01/08/2020
     * --------------------------------------------------------------*/
    public  String getListStudents(){
        String sol="";
        for (int i = 0; i < length; i++) {
            sol = sol + students[i].getInfo() + "\n";
        }
        return sol;
    }


    /*-------------------------------------------------------------
     * Check Danh sách lớp của Sinh Viên
     * Created By Hieu 01/08/2020
     * --------------------------------------------------------------*/
    public String CheckGroup() {
        String sol = "";
//        group;
//        students[1].getGroup();
        for (int i = 0; i < length; i++) {
            for(int j = 0; ; j++){
                if(group[j] == students[i].getGroup())break;
                else if (group [j] != students[i].getGroup() && j == idem ){
                    group[j] = students[i].getGroup();
                    idem ++;
                    break;
                }
            }
        }
        for (int i = 0; i < idem; i++) {
            sol = sol + group[i] + "\n";
        }
        return sol;
    }

    /*-------------------------------------------------------------
     * Sắp xếp Sinh viên theo Group Lớp
     * Created By Hieu 01/08/2020
     * --------------------------------------------------------------*/
     public String StudentByGroup(){
        this.CheckGroup();
        String sol = "";
         for (int i = 0; i < idem; i++) {
             for (int j = 0; j < length; j++) {
                 if(students[j].getGroup() == group[i]){
                    sol = sol + students[j].getInfo() + "\n";
                 }
             }
         }
         return sol;
    }


    /*-------------------------------------------------------------
     * Xóa sinh viên với mã số là id ra khỏi danh sách
     * Created By Hieu 01/08/2020
     * --------------------------------------------------------------*/

    public void removeStudent(String id){
         int location = 0;
         for (int i = 0; i < length; i++) {
            if(students[i].getId().equals(id)){
                location = i;
                break;
            }
        }
        for (int i = location; i < length; i++) {
            students[i] = students[i+1];
        }
        length --;
    }
}



