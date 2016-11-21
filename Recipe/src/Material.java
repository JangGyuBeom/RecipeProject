import java.util.*;

public class Material extends Price{
	static ArrayList<String> mat = new ArrayList<String>();

	public static ArrayList<String> getMat() {
		return mat;
	}

	public static void setMat(ArrayList<String> mat) {
		Material.mat.addAll(mat);
	}
}
