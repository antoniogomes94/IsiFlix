
public class TimeTeste {
	public static void main(String[] args) {
		Time t = new Time();
		
//		t.setTime(0, 5, 8);
//		t.setTime(22,35);
		t.setTime(15);
		
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}
}
