import java.util.ArrayList;
import java.util.List;

public class PackageBuild {

	private Package[] findDependencyClosure(Package[] allPackages, Package p) {
		return allPackages;

	}

	private void createAllPackage() {
		List<Package> allPackage = new ArrayList<>();
		Package pkg = new Package();
		pkg.setName("A");
		pkg.setVersion(1);
		Dependency dep = new Dependency();
		dep.setName("B");
		dep.setMinversion(1);
		dep.setMaxversion(2);
		List<Dependency> depList = new ArrayList<>();
		depList.add(dep);
		dep = new Dependency();
		dep.setName("C");
		dep.setMinversion(1);
		dep.setMaxversion(1);
		depList.add(dep);
		pkg.setDependency(depList);
		allPackage.add(pkg);

		pkg = new Package();
		pkg.setName("A");
		pkg.setVersion(2);
		dep = new Dependency();
		dep.setName("B");
		dep.setMinversion(1);
		dep.setMaxversion(2);
		depList = new ArrayList<>();
		depList.add(dep);
		pkg.setDependency(depList);
		allPackage.add(pkg);

		pkg = new Package();
		pkg.setName("A");
		pkg.setVersion(3);
		dep = new Dependency();
		dep.setName("C");
		dep.setMinversion(2);
		dep.setMaxversion(2);
		depList = new ArrayList<>();
		depList.add(dep);
		pkg.setDependency(depList);
		allPackage.add(pkg);

		pkg = new Package();
		pkg.setName("B");
		pkg.setVersion(1);
		allPackage.add(pkg);

		pkg = new Package();
		pkg.setName("C");
		pkg.setVersion(1);
		allPackage.add(pkg);

		System.out.println(allPackage);

	}

	public static void main(String[] args) {
		new PackageBuild().createAllPackage();
	}

}

class Package {
	String name;
	int version;
	List<Dependency> dependency;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<Dependency> getDependency() {
		return dependency;
	}

	public void setDependency(List<Dependency> dependency) {
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		String str = "Name  : " + name + "  Version :" + version + " Dependency " + dependency;
		return str;
	}

}

class Dependency {
	String name;
	int minversion;
	int maxversion;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinversion() {
		return minversion;
	}

	public void setMinversion(int minversion) {
		this.minversion = minversion;
	}

	public int getMaxversion() {
		return maxversion;
	}

	public void setMaxversion(int maxversion) {
		this.maxversion = maxversion;
	}

	@Override
	public String toString() {
		String str = "Name :" + name + " minversion :" + minversion + " maxversion " + maxversion;
		return str;
	}
}