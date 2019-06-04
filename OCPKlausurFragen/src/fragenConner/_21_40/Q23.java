package fragenConner._21_40;

import java.util.concurrent.Callable;

//Given code fragments:

class Canvas implements Drawable {
	public void draw() {}
}

abstract class Board extends Canvas {
}

class Paper extends Canvas {
	protected void draw(int color) {}
}

class Frame extends Canvas implements Drawable {
	public void resize() {}
}

interface Drawable {
	public abstract void draw();
}

public class Q23 {

	public static void main(String[] args) {
		/**
		 * Which statement is true?
		 * 
		 * A. Board does not compile.
		 * B. Paper does not compile.
		 * C. Frame does not compile.
		 * D. Drawable does not compile.
		 * E. All classes compile successfully.
		 * 
		 * 
		 * 
		 * Correct Answer: E
		 */
	}
}
