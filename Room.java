package Game;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public interface Room {
	public boolean isComplete();
	public void enter(MyPlayer player, PrintWriter pw);
	@Override
	public String toString();
	


}