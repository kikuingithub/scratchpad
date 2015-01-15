package tgm;

public class BasicAntProject {
  public static void main(String[] args) {
    BasicAntProject bap = new BasicAntProject();
    System.out.println(bap.getStringToPrint());
    // test!
  }

  public String getStringToPrint() {
    return "%helloworldtext%";
  }
}
