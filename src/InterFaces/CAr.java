package InterFaces;

public class CAr implements Engine ,Break{
    @Override
    public void start() {
        System.out.println("i start with a voice like tuuu tuu tuuu tuuu");

    }

    @Override
    public void stop() {
        System.out.println("i stop  with drift ");

    }

    @Override
    public void acc() {
        System.out.println(" my acceleration i s high");

    }

    @Override
    public void breaks() {
        System.out.println("breaks are normal");

    }
}
