class Task2CountingWordsSentences{
public static void main(String[]args){
String s ="Sri Vasavi Institute Of Engineering And Technology.Sri Vasavi Institute Of Engineering And Technology.Sri Vasavi Institute Of Engineering And Technology";
System.out.println(s);
char c[]=s.toCharArray();
int words=0;
for(int i=0;i<c.length;i++){
if(c[i]==' '||c[i]=='.'){
words++;
}
}
words++;
System.out.println("Words are:"+words);
int vowels=0;
int consonents=0;
for(int i=0;i<c.length;i++){
if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
vowels++;
}
else if(c[i]!=' ' && c[i]!='.' && Character.isLetter(c[i]))
{
consonents++;
}
}
System.out.println("Vowels are:"+vowels);
System.out.println("Consonents are:"+consonents);
int count=0;
for(int i=0;i<c.length;i++){
if (c[i] != ' ' && c[i] != '.' && Character.isLetter(c[i])){
count++;
}
}
System.out.println("Characters are:"+count);
int sentences=0;
for(int i=0;i<c.length;i++){
if (c[i]=='.'){
sentences++;
}
}
sentences++;
System.out.println("Sentences are:"+sentences);

}
}
