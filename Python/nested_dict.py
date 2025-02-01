# create a dict to store info about multiple students. each student should have nested info including name age grade for 3 subjects
# write a function to calculate the average grade for each student and another for adding new student data
students = {student1: {'name': 'sami', 'age': 23,   'grade': {'math': 90, 'science': 85, 'english': 88}},
student2: {'name': 'salekin', 'age': 22, 'grade': {'math': 95, 'science': 90, 'english': 92}},
}
def add_student(students,studentid,name,age,grades){
    students[studentid] = {"name":name,"age":age,"grades":grades}
}

def calculate_avg(students, student_id):
    grades = students[student_id]
    