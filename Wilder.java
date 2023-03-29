public class Wilder {

  //atributes
  private String firstName;
  private boolean aware;

  //constructors
  public Wilder(String firstname, boolean aware){
    this.firstName = firstname;
    this.aware = false;
  }

  //getters
  public String getFirstName(){
    return this.firstName;
  }

  public boolean isAware(){
    return this.aware;
  }

  //setters
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setAware(boolean aware){
    this.aware = aware;
  }

  //methodes
  public String whoAmI(){
    if(isAware()){
      return "Je m'appelle " + this.getFirstName() + " et je suis aware";
    }
    else{
      return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
    }
  }
}
