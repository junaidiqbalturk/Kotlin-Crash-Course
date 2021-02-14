//LOGICAL AND COMPARISON OPERATOR

fun main (){
    val amIAnAdult = true;
    val amIAProgrammer = true;

    val amIAnAdultProgrammer = amIAnAdult && amIAProgrammer //AND Operator

    val amI = amIAnAdult || amIAProgrammer //OR Operator

    //Equals Operator
    val equalOperator = (amIAnAdult == amIAProgrammer)

    // Not Equals Operator
    val notEqualOperator = (amIAnAdult != amIAnAdultProgrammer)
    println(amIAnAdultProgrammer)

    println(amI)

    println(equalOperator)
}