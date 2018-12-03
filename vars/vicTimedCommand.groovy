// vars/timedCommand.groovy

def setCommand(commandToRun) {

    cmd = commandToRun

}

 

def getCommand() {

    cmd

}

 

def runCommand() {

   timestamps {

    //  cmdOut = sh (script:"${cmd}", returnStdout:true).trim()

              def cmdOut1 = bat returnStdout: true, script: "${cmd}"

              cmdOut = cmdOut1.trim()

   }

}

 

def getOutput() {

   cmdOut

}