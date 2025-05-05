
# File system research - מחקר על מערכת הקבצים

## 1. איך יוצרים תיקייה בג'אווה?

כדי ליצור תיקייה בג'אווה, יש להשתמש במחלקה `java.io.File` ובפונקציה `mkdir()`.

צריך להגדיר את הנתיב (המסלול) שבו רוצים ליצור את התיקייה.

> **הערה:** התשובה הזאת יוצרת תיקייה אחת בלבד. בשביל ליצור כמה תיקיות ביחד – יש להשתמש בפונקציית `mkdirs()`.

הקוד הבא מדגים כיצד לעשות זאת:

```java
import java.io.File; // כדי להתחיל ולהשתמש במחלקת File

public class Main {
    public static void main(String[] args) {
        String directory = "/Users/moekh/OneDrive/Desktop/New_folder_2"; // הגדרת הנתיב
        File f1 = new File(directory); // יצירת אובייקט מסוג File עם הנתיב
        boolean created = f1.mkdir(); // שימוש בפונקציה ליצירת התיקייה
    }
}
```

## 2. איך יוצרים קובץ?

כדי ליצור קובץ חדש בג'אווה, משתמשים במחלקה `File` ובפונקציה `createNewFile()`.

הפונקציה היא בוליאנית ומחזירה `True` אם הקובץ נוצר, ו-`False` אם לא.

> **הערה:** יש לקבוע את הנתיב בצורה נכונה ולתת שם מתאים לקובץ, כך שלא יהיה כבר קובץ או תיקייה באותו השם.

הקוד הבא מדגים כיצד לעשות זאת:

```java
import java.io.File; // יבוא מחלקת File
import java.io.IOException; // יבוא מחלקת IOException לטיפול בשגיאות

public class Main {
    public static void main(String[] args) throws IOException {
        String directory = "/Users/moekh/OneDrive/Desktop/hello.docs"; // קביעת הנתיב
        File f2 = new File(directory); // יצירת אובייקט File
        boolean created = f2.createNewFile(); // יצירת קובץ חדש
    }
}
```

[מקור - DataCamp](https://www.datacamp.com/doc/java/create-&-write-files)

## 3. איך בודקים אם קובץ/תיקייה קיימים?

כדי לבדוק אם קובץ או תיקייה קיימים בנתיב מסוים, משתמשים באובייקט מסוג `File` ובפונקציה `exists()`.

הפונקציה היא בוליאנית ומחזירה `True` או `False`.

```java
File f2 = new File("/Users/moekh/OneDrive/Desktop/hello.docx");
System.out.println(f2.exists()); // ידפיס true אם הקובץ קיים
```

[מקור - תיעוד File של Oracle](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)

## 4. איך מציגים את תוכן תיקייה?

להצגת תוכן של תיקייה, משתמשים באובייקט `File` ובפונקציה `list()`, שמחזירה מערך של מחרוזות (שמות הקבצים והתיקיות שבתוכה).

```java
File f2 = new File("/Users/moekh/OneDrive/Desktop/New_Folder_2"); // יש לוודא שהנתיב הוא לתיקייה
System.out.println(Arrays.toString(f2.list()));
```

[מקור - תיעוד File של Oracle](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)

## 5. מה ההבדל בין File ל- Path?

| נושא | File | Path |
|:---|:---|:---|
| ג'אווה גרסה | מחלקה ישנה יחסית (משנות ה-90) | מחלקה חדשה יותר (נוספה בג'אווה 7) |
| מייצגת | מייצגת נתיב לקובץ או תיקייה במערכת הקבצים | מייצגת את הנתיב עצמו בלבד |
| שייכת | `java.io.File` | `java.nio.file.Path` |
| אופן שימוש | פעולות ישירות כמו `createNewFile()`, `exists()` | פעולות נעשות דרך מחלקות אחרות |
| גמישות וביצועים | פחות גמישה, בעייתית לקבצים גדולים ורשתות | גמישה יותר, מתאימה גם לעבודה ברשתות |
| המרה ביניהם | `toPath()` | `toFile()` |

### מקורות:

- [JavaGuides: Path vs File](https://www.javaguides.net/2023/11/difference-between-path-and-file-in-java-nio.html)
- [Oracle Tutorial: Path](https://docs.oracle.com/javase/tutorial/essential/io/path.html)
- [Reddit: Paths vs Files in Java](https://www.reddit.com/r/learnjava/comments/t8nbnj/what_is_the_difference_between_paths_and_files/)

---

**סדין חטיב**
