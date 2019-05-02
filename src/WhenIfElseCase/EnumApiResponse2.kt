package WhenIfElseCase

//enumeration avec liste des proprietes


enum class ApiResponse2(val codes: Array<Int>) {
  OK(arrayOf(200, 201, 202)),
  NOT_FOUND(arrayOf(404)),
  UNAUTHORIZED(arrayOf(401)),
  FORBIDDEN(arrayOf(403)),
  ERROR(arrayOf(500, 406)),
  UNKNOWN(arrayOf(0)),
}