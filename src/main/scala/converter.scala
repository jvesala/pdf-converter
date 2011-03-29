import org.apache.pdfbox.pdmodel._
//import scala.collection.JavaConversions._ 

object Converter {
  
  def test = {
    val doc = PDDocument.load("pdf/2006-4.pdf")
    val pages = doc.getDocumentCatalog.getAllPages
    
    val output = new PDDocument
    output.addPage(pages.get(0).asInstanceOf[PDPage])
    
    output.save("output.pdf")
    output.close
  }
  
  def main(args: Array[String]): Unit = {

  }
}
