class TimeLimitedCache {
  constructor() {
    this.cache = new Map();
  }

  set(key, value, duration) {
    const currentTime = Date.now();
    const expireTime = currentTime + duration;
    const existing = this.cache.get(key);
    let alreadyExists = false;

    // clear previous timeout to prevent the old firing
    if (existing && existing.expireTime > currentTime) {
      alreadyExists = true;
      clearTimeout(existing.timeout);
    }

    const timeout = setTimeout(() => {
      this.cache.delete(key);
    }, duration);

    this.cache.set(key, { value, expireTime, timeout });

    return alreadyExists;
  }

  get(key) {
    const entry = this.cache.get(key);
    return entry ? entry.value : -1;
  }

  count() {
    return this.cache.size;
  }
}

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */
