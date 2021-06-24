// 获取文件, 把文件处理成二维数组的格式
const fs = require('fs')


function loadFile() {
  try {
    const data = fs.readFileSync('./data.txt', 'utf8')
    return data
  } catch (err) {
    console.error(err)
  }
}


function parseLine(line) {
  if(line.charAt(0) === '#'){
    return ''
  }
  return line.split(',')
}

function read2dArray() {
  const allFile = loadFile()
  let lineArray = allFile.split('\r\n')
  for (let lineIndex = 0; lineIndex < lineArray.length; lineIndex++) {
    // console.log(lineArray[lineIndex])
    lineArray[lineIndex] = parseLine(lineArray[lineIndex])
  }
  let _2dArray = lineArray.filter(value => value!='')
  console.log(_2dArray)
  return _2dArray
}

read2dArray()



