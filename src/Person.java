
public class Person {
  private String name;
  private String phoneNumber;
  private String city;

  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

    public boolean isLondon(Person person){
    return person.getCity().equals("London");
  }
  public void nameLengthFiveOrLonger(Person person){
    if (person.getName().length()>= 6){
      System.out.println(person.getName());
    } else{
      System.out.println("Name is too short.");
    }
  }


}