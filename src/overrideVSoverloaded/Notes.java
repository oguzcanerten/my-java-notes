package overrideVSoverloaded;

public class Notes {

	/*
	 * overloaded metotlar i�in parametreler de�i�melidir. say�,tip olabilir.
	 * override metotlar i�in parametre ayn� olmal�d�r.
	 * 
	 */

}

/*overloaded metotlarda donus tipi de�i�ebilir.
 * override metotlarda donus tipi de�i�mez
 * overloaded metotlar i�in access level de�i�ebilir fark etmez.
 * override metotlar i�in access level artabilir azalamaz.
*/


/*
 * overloaded metotlar i�in dei�kenin tipi �nemlidir compile time da belli olur
 * override metotlarda da de�i�kenin tipi �nemlidir.runtime da belli olur
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
