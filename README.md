# Exercise1
# 🖥 Mini Power Shell

פרויקט זה הוא סימולציה בסיסית של מעטפת שורת פקודה (Mini PowerShell) בשפת Java.  
באמצעותו ניתן לבצע פעולות פשוטות על מערכת הקבצים, כגון: הצגת תיקיות וקבצים, ניווט ביניהם, יצירת קבצים ותיקיות ועוד(mkdir, touch, cd, ls, help, exit, pwd).

##  1. תיאור כללי של הפרויקט

מטרת הפרויקט היא לתרגל עבודה עם קלט משתמש, ניהול קבצים ותיקיות, וכו" בשפת java .  
ה"MiniShell" מדמה סביבה בסיסית של שורת פקודה, בדומה ל־PowerShell או Bash, אך בצורה פשוטה וחינוכית כך שנוכל איך הוא עובד ומתייחס ל-commands.

## 2. איך מקמפלים ומריצים את הקוד?

1. פותחים עורך קוד (למשל IntelliJ או Visual Studio Code) ובתרגיל הזה השתמשתי ב _ intellij.
2. יוצרים פרויקט חדש בשפת Java.
3. שומרים בו את שני הקבצים:
   - `MiniShell.java`---->  של הפרויקט main -שזה ה
   - `ShellCommandHandler.java`----> shell-המחלקה שמכילה את כל התכונות והפעולות (פונקציות) של האופייקט ב
  
### א. קימפול הקוד
לאחר שיצרתנו את הפרויקט ושמרנו את הקבצים, יש לקמפל את הקוד באמצעות פקודות הקומפילציה של Java.

- פתחתי את שורת הפקודה או טרמינל. (לא משנה שניהם עושים אותה העבודה, אישי השתמשתי ב-Terminal)
- נגיע לתיקיית הפרויקט שבו שמרת את הקבצים.--->  (שם התיקייה) cd 
- השתמש בפקודת הקימפול הבאה כדי לקמפל את שני הקבצים:
  
  ```bash
  javac MiniShell.java ShellCommandHandler.java
  
    -ואז מריצים את הקוד עם java MiniShell (the main class) באמצעות run.

 ## 3. דוגמה להפעלה של הקוד
 כשהקוד רץ, תופיע שורת הפקודה הבאה: 
                                                                                                                                       to make a folder/ directory
                                                                                                                                                                  C:\Users\yourname > 
                                                                                                                                                                 C:\Users\yourname > mkdir test //-----> to make a directory/folder we use the command: touch [folder name]
Directory created: test // **output**

C:\Users\yourname > cd test
Moved to: C:\Users\yourname\test // **output**

C:\Users\yourname\test > touch file1.txt //-----> to make a file we use the command: touch [file name]
File created: file1.txt  // **output**

C:\Users\yourname\test > ls //-----> to list all the files and folders in the directory (test)
[FILE]file1.txt // **output**3#

**4️ הערות בקוד – מה כל שיטה עושה?**


המחלקה הראשית:: 
 **➤ MiniShell.java**

String[] parts = input.split(" ", 2);   // שומר את הפקודה שהמשתמש הקליד ומפרק אותה לשם פקודה + פרמטר
switch (command) { ... } 
// בודק איזו פקודה הוזנה, ומריץ את המתאימה דרך ShellCommandHandler
----> היה אפשרי גם להשתמש במשפטי התנאי (if, else if..)  כדי לקרוא לפונקציות בתוך ShellCommandHandler לפי הפרמיטר
**➤ ShellCommandHandler.java**


1--> public void printWorkingDirectory() // מחזיר את המיקום הנוכחי במערכת הקבצים

2--> public void listDirectory() // מציג את כל הקבצים והתיקיות שבתוך התיקייה הנוכחית

3--> public void changeDirectory(String name) // עובר לתיקייה אחרת, לפי שם שנתן המשתמש

4--> public void makeDirectory(String name) // יוצר תיקייה חדשה בשם שניתן

5--> public void createFile(String name) // יוצר קובץ ריק בשם שניתן

6--> public void printHelp() // מדפיס כל הפקודו שקיימות בתכונה

**"Available commands:"**
    pwd            - Print the current working directory
    ls             - List all files and directories in the current directory
    cd [dir]       - Change directory to [dir] or '..' to go up
    mkdir [name]   - Create a new directory with the given name
    touch [name]   - Create a new empty file with the given name
    help           - Show this help information
    **exit           - Exit the shell**










  
  
  
  
     
     
   
