# Java File Handling Cheat Sheet

A concise guide to **file handling in Java**: creating, reading, writing, renaming, deleting, and listing files.

---

## 1. File Creation

| Task | Class / Method | Description |
|------|----------------|-------------|
| Create a file | `File file = new File("filename.txt")` | Creates a `File` object; does not create the actual file on disk. |
| Create actual file | `file.createNewFile()` | Creates the file on disk; returns `true` if created, `false` if exists. |
| Check if file exists | `file.exists()` | Returns `true` if the file exists. |

---

## 2. Writing to Files

| Task | Class / Method | Description |
|------|----------------|-------------|
| Basic writing | `FileWriter writer = new FileWriter("file.txt")` | Writes text to a file. Use `writer.write("text")`. |
| Append mode | `FileWriter writer = new FileWriter("file.txt", true)` | Appends text instead of overwriting. |
| Buffered writing | `BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))` | Efficient writing with buffering; supports `writer.newLine()`. |

---

## 3. Reading from Files

| Task | Class / Method | Description |
|------|----------------|-------------|
| Basic reading | `FileReader reader = new FileReader("file.txt")` | Reads characters from a file. |
| Buffered reading | `BufferedReader br = new BufferedReader(reader)` | Reads lines efficiently; use `br.readLine()` in a loop. |
| Check end of file | `readLine() != null` | Continue reading until no more lines. |

---

## 4. Renaming and Deleting

| Task | Class / Method | Description |
|------|----------------|-------------|
| Rename file | `file.renameTo(newFile)` | Renames the file; returns `true` if successful. |
| Delete file | `file.delete()` | Deletes the file; returns `true` if successful. |

---

## 5. Directory Operations

| Task | Class / Method | Description |
|------|----------------|-------------|
| List files in directory | `File dir = new File("folder")` <br> `dir.listFiles()` | Returns an array of `File` objects. |
| Check if directory | `dir.isDirectory()` | Returns `true` if it is a directory. |
| Create directory | `dir.mkdir()` | Creates a new directory. |
| Create nested directories | `dir.mkdirs()` | Creates directory along with parent directories if not exist. |

---

## 6. Exception Handling

| Exception | When it occurs |
|-----------|----------------|
| `IOException` | General input/output errors, e.g., file not found, permission denied. |
| `FileNotFoundException` | File not found when trying to read/write. |
| `SecurityException` | Lack of permission to access a file or directory. |

**Tip:** Always use **try-catch** blocks to handle exceptions:

```java
try {
    // file operations
} catch (IOException e) {
    e.printStackTrace();
}
