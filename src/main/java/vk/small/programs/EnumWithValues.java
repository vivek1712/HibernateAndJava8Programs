package vk.small.programs;

public enum EnumWithValues {
vivek(1),a2a(2),mdu(3);
int val;
EnumWithValues(int v){
	val=v;
}
public int getVal(){
	return this.val;
}
public String getName(){
	return this.name();
}

}
