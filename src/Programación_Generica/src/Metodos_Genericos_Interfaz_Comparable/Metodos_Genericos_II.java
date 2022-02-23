package Metodos_Genericos_Interfaz_Comparable;

public class Metodos_Genericos_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombres [] = {"Juan","Pepe", "Abel" , "Sandra" , "Dani"};
	     System.out.println(ExaminarArray.getMenor(nombres));
	}

}
class ExaminarArray{
	public static <T extends Comparable> T getMenor(T[]elArray) {
		T objetoMenor = elArray[0];
		
		for (int i =1; i < elArray.length;i++) {
			if(objetoMenor.compareTo(elArray[i])> 0) {
				objetoMenor = elArray[i];
			}
		}
		return objetoMenor;
	}
}