package org.example.formTag;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;


public class Student {
    @NotNull(message = "Name cannot be null")
    @Length(min = 3, message = "length must be bigger than 3")
    private String fname;
    private String lname;
    private String conutry;

    private String favoriteProgrammingLanguage;
    @OperationSystemCheck
    private String operatingSystem;
    @NotNull
    @Max(value = 1000, message = "bigger than 1000 is not ok")
    private Integer age;
//    private LinkedHashMap<String,String> countryOptions;

    public Student() {
//        countryOptions =new LinkedHashMap<>();
//        countryOptions.put("BR","Brizil");
//        countryOptions.put("IR","Iran");
//        countryOptions.put("US","United State");
//        countryOptions.put("DE","Germany");
    }

    public Student(String fname, String lname) {
        this();
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

//    public LinkedHashMap<String, String> getCountryOptions() {
//        return countryOptions;
//    }

    public String getConutry() {
        return conutry;
    }

    public void setConutry(String conutry) {
        this.conutry = conutry;
    }

    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
