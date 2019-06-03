package classdesign.designpatterns_entwurfsmuster;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;

import javax.imageio.ImageIO;

/*
 * 
 * Eine 'Factory Methode' nach Oracle ist eine statische Methode, die
 * die Details zu dem Bilden von einem Objekt versteckt und dadurch die Anwendung 
 * von einer 'konkreten' Realisierung entkoppelt
 */

abstract class ThumbnailsCache {
	
	static ThumbnailsCache getInstance() {
		return new ThumbnailsCacheImpl();
	}
	
	abstract Image getImage(String name);
}


class ThumbnailsCacheImpl extends ThumbnailsCache {
	Image getImage(String name) {
		try {
			return ImageIO.read(new File(name));
		}catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
}


class A {
	void doStuff() {
	//	ThumbnailsCache cache = new ThumbnailsCacheImpl();
		ThumbnailsCache cache = ThumbnailsCache.getInstance();	// A von ThumbnailsCacheImpl entkoppelt
	}
}
	
class B {
	void doMoreStuff() {
	//	ThumbnailsCache cache = new ThumbnailsCacheImpl();
		ThumbnailsCache cache = new ThumbnailsCache.getInstance(); // B von ThumbnailsCacheImpl entkoppelt
	}
}	




public class Factory_nach_Oracle {
	public static void main(String[] args) {
	}
}
