package Assignment2;

//Interface
interface Info{
    abstract void display();
    
}
//Public Class
public class Devil implements Info{
        private String name;
        private String address;

        public void setName(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
        
        public void setAddress(String address) {
            this.address = address;
        }
        
        public String getAddress() {
            return address;
        }

        public void display(){
            System.out.println("Hi");
        }


    //Private Inner Class
    private class Devil_fname_info{
        private String f_name;
        public String getF_name() {
            return f_name;
        }
        public void setF_name(String f_name) {
            this.f_name = f_name;
        }
    }
    //protected inner class
    protected class Devil_mname_info{
        private String m_name;
        public String getM_name() {
            return m_name;
        }
        public void setM_name(String m_name) {
            this.m_name = m_name;
        }
    }
}