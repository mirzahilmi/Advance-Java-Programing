package projects.project2;

class CarRider {

  private String name;
  private int age;
  private String phone;

  CarRider(String name, int age, String phone) {
    this.name = name;
    this.age = age;
    this.phone = phone;
  }

  void setName(String name) {
    this.name = name;
  }

  void setAge(int age) {
    this.age = age;
  }

  void setPhone(String phone) {
    this.phone = phone;
  }

  String getName() {
    return this.name;
  }

  int getAge() {
    return this.age;
  }

  String getPhone() {
    return this.phone;
  }
}
