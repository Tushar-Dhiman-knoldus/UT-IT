package Question1and2

import org.slf4j.{Logger, LoggerFactory}

class DuplicateChecker {

  private val logger: Logger = LoggerFactory.getLogger(getClass)

  def checkDuplicateInList(list: List[Int]): Boolean = {

    logger.info("Checking for duplicates in list: {}", list)
    val hasDuplicate = list.distinct.size != list.size
    if (hasDuplicate) logger.info("List {} contains duplicate(s)", list)
    hasDuplicate
  }
}
