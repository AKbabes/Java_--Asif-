
package Lab5_2;

public class PhoneBook {
    private String name;
    private String email;
    private String phone;

    public void setName(String xName){
        this.name = xName;
    }
    public void setEmail(String xemail){
        this.email = xemail;
    }
    public void setPhone(String xphone){
        this.phone = xphone;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }

}