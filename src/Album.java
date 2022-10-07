/**
 * Classe de partida per la Practica 1 de PROGRAMACIO curs 2022-23
 * @author Professores PR
 *
 */

public class Album {

	private String nom;
	private final int cmAlt;
	private final int cmAmple;
	private int numTotalPagines;
	private int numFotosPagina;
	private int numPagPlenes;
	private int numFotosUltimaPag;
	private boolean albumPle;
	private static int minPag = 6;
	private static int maxPag = 20;

	/**
	 * Constructor Album de Fotos
	 * @param nom  identificador de l'album
 	 * @param alt  mesura de alt, en centimetres
	 * @param ample  mesura de ample, en centimetres
	 * @param nPagines   nombre total de pagines
	 * @param nFotosPag  nombre de fotos per plana
	 */
	public Album (String nom, int alt, int ample, int nPagines, int nFotosPag) {
		this.nom=nom; cmAlt=alt; cmAmple=ample;
		
		if (nPagines < minPag) {
			this.numTotalPagines = minPag;
			
		} else if (nPagines > maxPag) {
			this.numTotalPagines = maxPag;
		} else {
			this.numTotalPagines = nPagines;
		}
		
		numFotosPagina=nFotosPag;
		numPagPlenes=0;
		numFotosUltimaPag=0;
		albumPle =  false;
	}
	
	
	// Getters
	
	public String getNom() {
		return nom;
	}



	public int getCmAlt() {
		return cmAlt;
	}


	public int getCmAmple() {
		return cmAmple;
	}


	public int getNumTotalPagines() {
		return numTotalPagines;
	}


	public int getNumFotosPagina() {
		return numFotosPagina;
	}

	public int getNumPaginesPlenes() {
		return numPagPlenes;
	}

	public boolean isAlbumPle() {
		return albumPle;
	}
	
	/**
	 * Getter que ens calcula quantes fotografies hi ha posades a l'album
	 * @return    nombre de fotos a l'album
	 */
	public int getNumTotalFotosPosades() {
		
		if (albumPle) {
			return (numFotosPagina * numPagPlenes);
		} else {
			return (numFotosPagina * numPagPlenes) + numFotosUltimaPag;
		}
	}
	
	/**
	 * Metode per afegir una fotografia nova a l'album.
	 * S'assumeix que les fotos es van guardant en ordre consecutiu quan s'afegeixen
	 * per tant, sempre va al final de la darrera pagina.
	 * 
	 */
	public void afegirFoto () {
		if (!albumPle) {
			numFotosUltimaPag++;
			if (numFotosUltimaPag == numFotosPagina) {
				numPagPlenes++;
				numFotosUltimaPag=0;
			}
			if (numPagPlenes==numTotalPagines)
				albumPle =  true;
				numFotosUltimaPag = numFotosPagina;
		}
	}
	
	
	/**
	 * Afegir unes quantes pagines mes a l'album
	 * @param n   indica el nombre de pagines a afegir
	 */
	public void afegirPagines (int n) {
		
		//Si la ultima pagina estaba llena entonces el numFotosUltimaPag es 0
		
		if (numFotosUltimaPag == numFotosPagina) {
			numFotosUltimaPag = 0;
		}
		
		numTotalPagines= numTotalPagines+n;
		albumPle =  false;
	}
	
	/**
	 * Treure pagines de l'album, excepte si ja contenen fotos
	 * @param n    indica el nombre de pagines a eliminar 
	 *             nom�s s'eliminen si estan totalment buides
	 */
	public void treurePagines (int n) {
		
		//Si hem de eliminar una página i a la última hi ha alguna foto no podem
		
		int i = 0;
		
		if (numFotosUltimaPag > 0) {
			i++;
		}
		
		if (numTotalPagines-n >= numPagPlenes + i) {
			numTotalPagines = numTotalPagines-n;
			if ((numTotalPagines==numPagPlenes)) {
				albumPle=true;
			}
		} else {
			System.out.println("No se han podido eliminar las paginas");
		}
	}


	/**
	 * Retorna el contingut de l'objecte en format cadena
	 * @return cadena amb l'estat de l'objecte
	 */
	public String toString() {
		return "Album [nom=" + nom + ", cmAlt=" + cmAlt + ", cmAmple=" + cmAmple + ", numTotalPagines="
				+ numTotalPagines + ", numFotosPagina=" + numFotosPagina + ", numPagPlenes=" + numPagPlenes
				+ ", numFotosUltimaPag=" + numFotosUltimaPag + "]";
	}
	
	/**
	 * Crea un duplicat d'una instancia
	 * @return una instancia duplicada
	 */
	public Album copia() {
		Album duplicat = new Album(nom, cmAlt, cmAmple, numTotalPagines, numFotosPagina);
		
		duplicat.numPagPlenes = this.numPagPlenes;
		duplicat.numFotosUltimaPag = this.numFotosUltimaPag;
		
		duplicat.albumPle = this.isAlbumPle();
		
		return duplicat;
		
	}
	
	/**
	 * Treu l'ultim element afegit a l'album
	 * */
	public void treureFoto() {
		numFotosUltimaPag--;
	}
	
	/**
	 * Compara un àlbum amb un altre i comprova si l’objecte sobre el que s’aplica
	 * el mètode té més espai disponible per guardar noves fotos que el que s’indica per paràmetre
	 * 
	 * @param Album a comparar
	 * 
	 * @return boolea cert si te més espai que el paràmetre
	 * */
	public boolean teMesLliure(Album album) {
		
		int espai1; int espai2;
		
		espai1 = (this.getNumTotalPagines() * this.getNumFotosPagina()) - this.getNumTotalFotosPosades();
		espai2 = (album.getNumTotalPagines() * album.getNumFotosPagina()) - album.getNumTotalFotosPosades();
		
		if (espai1 > espai2) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Compara un àlbum amb un altre i retorna una còpia de la instància amb una
	 * mida de pàgina més gran (alçada x amplada).
	 * 
	 * @param Album a comparar
	 * 
	 * @return Copia de la instancia amb mida més gran o NULL
	 * */
	public Album elMesPetit(Album album) {
		
		int size1 = this.getCmAlt() * this.getCmAmple();
		int size2 = album.getCmAlt() * album.getCmAmple();
		
		if (size1 > size2) {
			return this.copia();
		} else if (size1 < size2) {
			return album.copia();
		} else {
			return null;
		}
	}
	
	/**
	 * Disminueix el minim de pagines del àlbum
	 * 
	 * @param Número de págines menys que volem tenir sobre el minim actual
	 * */
	
	public static void disminueixMinim(int num) {
		
		if (num >= minPag) {
			System.out.println("El número no pot ser més gran o igual que el mínim de pagines");
		} else {
			minPag = minPag - num;
		}
	}
	
	/**
	 * Augmenta el maxim de pagines del àlbum
	 * 
	 * @param Número de págines mes que volem tenir sobre el maxim actual
	 * */
	
	public static void augmentaMaxim(int num) {
		
		if (num <= 0) {
			System.out.println("El número ha de ser mes gran que 0");
		} else {
			if (maxPag + num > 99) {
				System.out.println("Les fotos maximes no poden ser mes de 99, no es sumara el maxim");
			} else {
				maxPag += num;
			}
		}	
	}
	
}
