package Tools;

import java.io.File;
import java.util.Scanner;

/**
 * 批量更改文件名称的程序
 * @author Lucifer.Ma
 *	 IPv4 地址 . . . . . . . . . . . . : 192.168.2.2
 */
public class RenameFiles {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("将目录地址复制到这里：");
		String path=sc.nextLine();
		File dir=new File(path);
		System.out.println("将要删除的文字复制到这里：");
		String word=sc.nextLine();
		File[] files=dir.listFiles();
		for(File file:files){
			if(file.isFile()){
			String fileName=file.getName();
			fileName=fileName.replace(word, "");
			File file2=new File(path+"/"+fileName);
			file.renameTo(file2);
			}
		}
		System.out.println("OK?");
		sc.close();
	}
}
