
public class Cat {

  private String name;
  private String favoriteFood;
  private int age;
  private Person owner;

  public Cat() {
  }

  public Cat(String name) {
    this.name = name;
  }

  public String getFavoriteFood() {
    return favoriteFood;
  }

  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public Person getOwner() {
    return owner;
  }

  public boolean isOlder(int firstCatAge, int secondCatAge){
    return firstCatAge > secondCatAge;
  }

  // A class can take its own objects as a parameter and then work on them and change their values as needed.
  public void setSameFavoriteFood(Cat firstCat, Cat secondCat) {
    if (!firstCat.getFavoriteFood().equals (secondCat.getFavoriteFood())){
      secondCat.setFavoriteFood(firstCat.getFavoriteFood());
    }
  }
  public Cat makeKitten(Cat firstCat, Cat secondCat) {
    String newCatName = firstCat.getName() + secondCat.getName();
    int newCatAge = 0;
    Cat newKitten = new Cat (newCatName);
    newKitten.setAge(newCatAge);
    return newKitten;
  }
  public void adoption (Cat cat, Person person) {
    if (!cat.getName().equals("Catwoman")) {
      cat.setOwner(person);
    }
  }

  //Bonus questions:

  public void AlwaysFreeCatWoman(Cat cat){
    if (cat.getName().equals("Catwoman")){
      System.out.println("Catwoman will never be anyone's pet!");
    }
  }

  public boolean isCheck(Cat cat) {
    if (cat.getName().equals("Catwoman")) {
      return false;
    }
    return true;
  }
  public boolean isSibling (Cat firstCat, Cat secondCat) {
    return firstCat.getOwner().equals(secondCat.getOwner());
  }

}
