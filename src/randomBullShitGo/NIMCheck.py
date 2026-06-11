nim = input("Enter NIM : ")

print(f"Angkatan : 20{nim[0:2]}")
print(f"Strata : S{nim[2]}")

faculty = "Fakultas Teknologi Informasi" if nim[3:5] == "15" else "bukan Fakultas Teknologi Informasi"
print(f"Fakultas : {faculty}")

match nim[5]:
    case "1": major = "Teknik Komputer"
    case "2": major = "Sistem Informasi"
    case "3": major = "Informatika"
    case _:   major = "Lainnya"
print(f"Jurusan : {major}")

enlistmentMethod = "Jalur SNBP" if nim[6] == "1" else "bukan Jalur SNBP"
print(f"Jalur Masuk : {enlistmentMethod}")

studentNumber = nim[7:]

print(f"Nomor BP : {studentNumber}")
