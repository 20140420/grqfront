package com.grq.model.bean;
// default package


import com.grq.model.bean.Experience;
import com.grq.model.bean.PowerConfig;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee  implements java.io.Serializable {


    // Fields    

     private Integer employeeId;
     private PowerConfig tbPowerConfig;
     private Education education;
     private Experience Experience;
     private String firstName;
     private String lastName;
     private String formerName;
     private String nickname;
     private String sex;
     private Integer age;
     private Date birthday;
     private String residence;
     private String address;
     private String email;
     private Long telephone;
     private Integer qq;
     private String qualification;
     private String major;
     private String motto;
     private String cardHolder;
     private String bankName;
     private Long bankAccount;
     private String headPic;
     private Integer salaryExpectation;
     private Integer seniority;
     private String password;
     private Timestamp lastLoginTime;
     private String identityCard;
     private Set users = new HashSet(0);


    // Constructors

    /** default constructor */
    public Employee() {
    }

	/** minimal constructor */
    public Employee(PowerConfig tbPowerConfig, Education education, Experience Experience, String firstName, String lastName, String email, Long telephone, Integer qq, String qualification, String major, String motto, String cardHolder, String bankName, Long bankAccount, String headPic, Integer salaryExpectation, Integer seniority, String password, Timestamp lastLoginTime, String identityCard) {
        this.tbPowerConfig = tbPowerConfig;
        this.education = education;
        this.Experience = Experience;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.qq = qq;
        this.qualification = qualification;
        this.major = major;
        this.motto = motto;
        this.cardHolder = cardHolder;
        this.bankName = bankName;
        this.bankAccount = bankAccount;
        this.headPic = headPic;
        this.salaryExpectation = salaryExpectation;
        this.seniority = seniority;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
        this.identityCard = identityCard;
    }
    
    /** full constructor */
    public Employee(PowerConfig tbPowerConfig, Education education, Experience Experience, String firstName, String lastName, String formerName, String nickname, String sex, Integer age, Date birthday, String residence, String address, String email, Long telephone, Integer qq, String qualification, String major, String motto, String cardHolder, String bankName, Long bankAccount, String headPic, Integer salaryExpectation, Integer seniority, String password, Timestamp lastLoginTime, String identityCard, Set users) {
        this.tbPowerConfig = tbPowerConfig;
        this.education = education;
        this.Experience = Experience;
        this.firstName = firstName;
        this.lastName = lastName;
        this.formerName = formerName;
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.residence = residence;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.qq = qq;
        this.qualification = qualification;
        this.major = major;
        this.motto = motto;
        this.cardHolder = cardHolder;
        this.bankName = bankName;
        this.bankAccount = bankAccount;
        this.headPic = headPic;
        this.salaryExpectation = salaryExpectation;
        this.seniority = seniority;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
        this.identityCard = identityCard;
        this.users = users;
    }

   
    // Property accessors

    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public PowerConfig getTbPowerConfig() {
        return this.tbPowerConfig;
    }
    
    public void setTbPowerConfig(PowerConfig tbPowerConfig) {
        this.tbPowerConfig = tbPowerConfig;
    }

    public Education getEducation() {
        return this.education;
    }
    
    public void setEducation(Education education) {
        this.education = education;
    }

    public Experience getTbExperience() {
        return this.Experience;
    }
    
    public void setTbExperience(Experience tbExperience) {
        this.Experience = tbExperience;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFormerName() {
        return this.formerName;
    }
    
    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getResidence() {
        return this.residence;
    }
    
    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Integer getQq() {
        return this.qq;
    }
    
    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public String getQualification() {
        return this.qualification;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getMajor() {
        return this.major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }

    public String getMotto() {
        return this.motto;
    }
    
    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getCardHolder() {
        return this.cardHolder;
    }
    
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Long getBankAccount() {
        return this.bankAccount;
    }
    
    public void setBankAccount(Long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getHeadPic() {
        return this.headPic;
    }
    
    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Integer getSalaryExpectation() {
        return this.salaryExpectation;
    }
    
    public void setSalaryExpectation(Integer salaryExpectation) {
        this.salaryExpectation = salaryExpectation;
    }

    public Integer getSeniority() {
        return this.seniority;
    }
    
    public void setSeniority(Integer seniority) {
        this.seniority = seniority;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getLastLoginTime() {
        return this.lastLoginTime;
    }
    
    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getIdentityCard() {
        return this.identityCard;
    }
    
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
   








}