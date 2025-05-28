package school;

/*4. Create a class with PUBLIC fields and methods.
Access the public methods and fields from any class in the same package or different
package.*/

public class Student {
    public String name = "Manaswitha";
    public int age = 22;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


/*
✅ Revision Note: public access modifier with multiple packages

→ 'Student' class is in package 'school' with public fields and methods.
→ 'SchoolApp' (same package): Can access public members ✅
→ 'CollegeApp' (different package 'college'): Can access public members ✅

🔁 Summary:
- Same package = ✅ access
- Different package = ✅ access
- Subclass or non-subclass = ✅ access
- Public = accessible from anywhere

Packages used:
- school: Student, SchoolApp
- college: CollegeApp

Use this example to understand how public members are accessible from any class and any package.
*/
