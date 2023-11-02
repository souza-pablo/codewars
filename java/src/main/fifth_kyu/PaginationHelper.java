package main.fifth_kyu;

import java.util.List;

//  kata/515bb423de843ea99400000a
public class PaginationHelper<I> {
  private final List<I> collection;
  private final Integer itemsPerPage;

  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
  }

  public int itemCount() {
    return this.collection.size();
  }

  public int pageCount() {
    return (int) Math.ceil((double) this.itemCount() / this.itemsPerPage);
  }

  public int pageItemCount(int pageIndex) {
    if (pageIndex < 0) return -1;
    if (pageIndex == this.pageCount() - 1) {
      if (this.pageCount() == 1) return this.itemCount();
      return this.itemCount() - ((this.pageCount() - 1) * this.itemsPerPage);
    }
    if (pageIndex < this.pageCount() - 1) {
      return this.itemsPerPage;
    }
    return -1;
  }

  public int pageIndex(int itemIndex) {
    if (itemIndex >= 0 && itemIndex < this.itemCount()) {
      return (int) Math.ceil((double) (itemIndex + 1) / this.itemsPerPage) - 1;
    }
    return -1;
  }
}