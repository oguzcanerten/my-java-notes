package overrideVSoverloaded;

public class Notes {

	/*
	 * overloaded metotlar için parametreler deðiþmelidir. sayý,tip olabilir.
	 * override metotlar için parametre ayný olmalýdýr.
	 * 
	 */

}

/*overloaded metotlarda donus tipi deðiþebilir.
 * override metotlarda donus tipi deðiþmez
 * overloaded metotlar için access level deðiþebilir fark etmez.
 * override metotlar için access level artabilir azalamaz.
*/


/*
 * overloaded metotlar için deiþkenin tipi önemlidir compile time da belli olur
 * override metotlarda da deðiþkenin tipi önemlidir.runtime da belli olur
 * 
 * 
 */
class SuperClass {

	public void override(String param1, int param2) {

	}

	class SubClass extends SuperClass {
		@Override
		public void override(String param1, int param2) {

			
			
		}

	}
}
