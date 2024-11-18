package programmer.zaman.now.data;


//ini adalah outer class
public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    ini adalah inner class
    public class Employee{
        private String name;

        public String getName() {
            return name;
        }

        public String getCompany(){
            return Company.this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
