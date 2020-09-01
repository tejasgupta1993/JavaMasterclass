package com.company;

public class Person {

    private String firstName, LastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen(){
        return (age > 12 && age < 20);
    }

    public String getFullName(){
//        String fullName = "";
//        if(!this.firstName.equals("") && this.LastName.equals("")){
//            fullName = " ";
//        }
//        return (this.firstName + fullName + this.LastName);

        if(this.firstName.isEmpty() == true && this.LastName.isEmpty() == true){
            return "";
        }else if(this.firstName.isEmpty() == true){
            return this.LastName;
        }else if(this.LastName.isEmpty()){
            return this.firstName;
        }else{
            return this.firstName + " " + this.LastName;
        }
    }
}
