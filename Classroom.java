public class Classroom {
  
  public static void main(String[] args) {

    Wilder jeanClaude = new Wilder("Jean-Claude", false);
    Wilder henri = new Wilder("Henri", false);

    jeanClaude.setAware(true);

    System.out.println(jeanClaude.whoAmI());
    System.out.println(henri.whoAmI());
  }
}
