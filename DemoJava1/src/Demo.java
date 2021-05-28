
/**
 * @author Cuongnm
 *
 */
public class Demo {

	public static void main(String[] args) {
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "group thứ 1";
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "group thứ 2";
		
		Student student1 = new Student();
		student1.id = 1;
		student1.fullName = "công rose";		
		// phải gán group cho student thì mới in được 
		// các thuộc tính của group đấy ra : student1.group.id
		//student1.group = group1;				
		
		// student1 tham gia 2 group :group1,group2
		Group[] dsGroup = {group1,group2};		
		student1.groups = dsGroup;		
		
		System.out.println(student1.fullName);		
		student1.groups[0].showInfo();
		student1.groups[1].showInfo();
	}

}
