<div class="copyright" >
  {% set current = date(Date.now(), "YYYY") %}
  &copy; {% if theme.since and theme.since != current %} {{ theme.since }} - {% endif %}
  <span itemprop="copyrightYear">{{ current }}</span>
  <span class="with-love">
    <i class="icon-next-heart fa fa-heart fa-fw"></i>
  </span>
  <span class="author" itemprop="copyrightHolder">{{ config.author }}</span>
</div>

<div class="powered-by">
  {{ __('footer.powered', '<a class="theme-link" href="http://hexo.io">Hexo</a>') }}
</div>

<div class="theme-info">
  {{ __('footer.theme') }} -
  <a class="theme-link" href="https://github.com/iissnan/hexo-theme-next">
    NexT{% if theme.scheme %}.{{ theme.scheme }}{% endif %}
  </a>
</div>

{% if config.busuanzi %}
  <div class="busuanzi">
    <span id="busuanzi_container_site_pv">
      {{__('footer.busuanzi_pv', '<a class="theme-link" href="http://service.ibruce.info"><span id="busuanzi_value_site_pv"></span></a>')}}
    </span>
  </div>
  <div class="busuanzi">
    <span id="busuanzi_container_site_uv">
      {{__('footer.busuanzi_uv', '<a class="theme-link" href="http://service.ibruce.info"><span id="busuanzi_value_site_uv"></span></a>')}}
    </span>
  </div>
{% endif %}

{% block footer %}{% endblock %}
