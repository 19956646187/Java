/*
	数组：存储同一种数据类型的多个元素的集合。(也可以称为容器)

	数组的定义格式：
		格式1：数据类型[] 数组名;
			int[] arr;
		格式2：数据类型 数组名[];
			int arr[];

		推荐方式1。

	现在的数组没有元素，使用是没有意义的。
	接下来，我们要对数组进行初始化。
	那么，我们如何对数组进行初始化呢?
		动态初始化：初始化时只指定数组长度，由系统为数组分配初始值。
		静态初始化：初始化时指定每个数组元素的初始值，由系统决定数组长度。

	动态初始化：
		数据类型[] 数组名 = new 数据类型[数组长度];

*/
class ArrayDemo {
	public static void main(String[] args) {
		//按照动态初始化数组的格式，我们来定义一个存储3个int类型元素的数组
		int[] arr = new int[3];

		/*
			左边：
				int:说明数组中的元素的数据类型。
				[]:说明这是一个数组
				arr:数组的名称
			右边：
				new:为实体(对象)开辟内存空间
					Scanner sc = new Scanner(System.in);
				int:说明数组中的元素的数据类型。
				[]:说明这是一个数组
				3:说明的是数组中的元素个数
		*/

		//我们如何获取里面的值呢?
		//数组名称
		System.out.println(arr); //[I@778b3fee 地址值
		//如何获取元素值呢?
		//数组为每个元素分配了一个编号，这个编号的专业叫法：索引。
		//而且是从0开始编号的。也就是说数组的最大编号是长度-1。
		//有了编号以后，我们就可以通过数组名和编号的配合取得数组元素
		//格式：数组名[编号];
		System.out.println(arr[0]); //0
		System.out.println(arr[1]); //0
		System.out.println(arr[2]); //0
	}
}